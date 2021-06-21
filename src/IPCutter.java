public class IPCutter {
    private String cmdLine;
    public IPCutter(String cmdLine){
        this.cmdLine=cmdLine;
    }
    public IPCutter(){
        cmdLine=null;
    }
    public String getCmdLine(){
        return cmdLine;
    }
    public void setCmdLine(String cmdLine) {
        this.cmdLine = cmdLine;
    }
    public int[] ipCutter(){
        String[] parts=cmdLine.split("\\.");
        int[] res=new int[4];
        if(parts.length!=4){
            System.out.println("Error in Input");
        }
        else{
            res[0]=Integer.parseInt(parts[0]);
            res[1]=Integer.parseInt(parts[1]);
            res[2]=Integer.parseInt(parts[2]);
            res[3]=Integer.parseInt(parts[3]);
        }
        return res;
    }


}
