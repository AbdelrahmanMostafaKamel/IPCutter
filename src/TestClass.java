public class TestClass {
    public static void main(String[] args){
        String commandLine="163.121.12.30";
        IPCutter cut=new IPCutter(commandLine);
        System.out.println("The result of cutting is:");
        int[] myRes=cut.ipCutter();
        System.out.println("The first IP Number is:"+myRes[0]);
    }
}
