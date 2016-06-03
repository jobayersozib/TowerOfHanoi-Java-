public static void TowerHanoi(int N,String BEG,String AUX,String END){
        if(N==1){
            System.out.println("Move "+BEG+" to "+END);
        }
        else{
            TowerHanoi(N-1,BEG,END,AUX);
            System.out.println("Move "+BEG+" to "+END);
            TowerHanoi(N-1,AUX,BEG,END);
            System.out.println("Move "+BEG+" to "+END);
        }
    }