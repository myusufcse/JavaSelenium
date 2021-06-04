public class RunTimeArgs {
    public static void main(String[] args) {
        // args will take space as separator
        print("Start");
        //print(args[0]);
        print("args length : "+args.length);
        for (String arg: args) {
            print(arg);
        }
        int i = 010;
        int j = 07;
        System.out.println(i);
        System.out.println(j);

        print("End");
    }

    static void print(String msg) {
        System.out.println(msg);
    }
}
