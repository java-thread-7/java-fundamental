import java.util.Scanner;

public class TodoListCLI {
    public static String[] model = new String[10];

    public static Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        viewShowTodoList();
    }

    public static void showTodoList() {
        System.out.println("TODOLIST");
        for (var i  = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;
            if(todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList() {
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus Java Dasar : Aplikasi TodoList";
        showTodoList();
    }

    public static void addTodoList(String todo) {
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if(model[i] == null) {
                isFull = false;
                break;
            }
        }

        if(isFull){
            var temp = model;
            model = new String[model.length * 2];
            for(int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        for (var i = 0; i < model.length; i++) {
            if(model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList() {
        for (int i = 0; i < 25; i++) {
            addTodoList("contoh todo ke - " + i);
        }
        showTodoList();
    }

    public static boolean removeTodoList(Integer number) {
        if((number - 1) >= model.length) {
            return false;
        }
        if(model[number - 1] == null) {
            return false;
        } else {
            for (int i = (number - 1); i < model.length; i++) {
                if (i == (model.length - 1)) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(4);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput() {
        var name = input("Nama");
        System.out.println("Hi "+ name);
    }


    public static void viewShowTodoList() {
        while (true) {
            showTodoList();

            System.out.println("MENU: ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("9. 'clear' untuk keluar ");

            var input = input("Pilih");

            if (input.equals("1")) {
                viewAddTodoList();
            } else if (input.equals("2")) {
                viewRemoveTodoList();
            } else if (input.equals("clear")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    public static void testViewShowTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");
        viewShowTodoList();
    }

    public static void viewAddTodoList() {
        System.out.println("MENAMBAHKAN TODOLIST");

        var todo = input("Todo (9 Jika Batal)");

        if(todo.equals("9")) {
            // batal
        } else {
            addTodoList(todo);
        }
    }

    public static void testViewAddTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        viewAddTodoList();

        showTodoList();
    }

    public static void viewRemoveTodoList() {
        System.out.println("MENGHAPUS TODOLIST");

        var number = input("Nomor yang dihapus (9 Jika Batal)");
        if (number.equals("9")) {
            // batal
        } else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if(!success) {
                System.out.println("Gagal menghapus todolist: " + number);
            }
        }
    }

    public static void testViewRemoveTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }
}
