public class Pr1 {
    
    public static void main(String[] args) {
        System.out.println("=== Deployment Health Checker v1.0 ===");
        System.out.println("Arguments received :" +args.length);

        if(args.length ==0){
            System.out.println("Usage: java Pr1 <service> <port>");
            return;
        }
        for (int i=0; i< args.length; i++){
            System.out.println(" args[" + i + "])= " + args[i]);
        }
        String service = args[0];
        int port = Integer.parseInt(args[1]);
        System.out.println("program chal raha hai " + service + "on port" +port+ ".....OK");
    }
}
