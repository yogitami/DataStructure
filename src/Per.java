public class Per {
    public static void printPermute(int[] noOfBoxes,int ce,int totalElements){
        if(ce > totalElements){
            for(int i=0;i<noOfBoxes.length;i++){
                System.out.print(noOfBoxes[i]);
            }
            System.out.println("-------");
            return;
        }

        for(int i=0;i<noOfBoxes.length;i++){
            if(noOfBoxes[i] ==0){
                noOfBoxes[i] = ce;
                printPermute(noOfBoxes,ce+1,totalElements);
                noOfBoxes[i] = 0;
            }

        }

    }
    public static void main(String args[]){
        int noOfBoxes = 4;
        int elements = 2;
        printPermute(new int[noOfBoxes],1,elements);
    }
}
