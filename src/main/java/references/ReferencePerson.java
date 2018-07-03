package references;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * https://dzone.com/articles/reference-types-java-part-1
 */
public class ReferencePerson {
    public static void main(String[] args) {
        //создаем StrongReference Person man ссылку man и выделяем память в HEAP на него
        Person man = new Person("Jack");

        //создаем StrongReference на новый объект SoftReference softRef с памятью в HEAP,
        // в котором содержиться внутренняя ссылка на man
        SoftReference<Person> softRef = new SoftReference<>(man);

        Person restoredMan = softRef.get();
        System.out.println(restoredMan);
    }

    public static void weekReference() {
        // примером, вы работаете с БД и создали HashMap (WeakHashMap) с коннекшинами и пользователями
        class DBConnection {
        }
        //создаем StrongReference DBConnection dbCon ссылку man и выделяем память в HEAP на него
        DBConnection dbCon = new DBConnection();

        // Когда никто уже не будет использовать данный конекшин, все ссылки на него будут удалены,
        // запись в мапе останется и будет забирать место, если ее вручную не удалить.
        // WeakReference проконтролирует, что если все коннекшины с объекта были удалены и остался только он сам,
        // объект будет отмечен на удаление полностью.

        // создаем очередь для слабых ссылок, в которой объекты будут отмечаться на удаление,
        // но удалятся, когда наберется достаточно объектов. Дает возможностью вручную управлять сбором мусора.
        ReferenceQueue<DBConnection> weekQueue = new ReferenceQueue<>();

        WeakReference<DBConnection> weakRef = new WeakReference<>(dbCon, weekQueue);

    }

    private static class Person {
        private String name;

        private Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
