public class array {
    public static void main(String[] args) {
        // initializing an array
        String[] cars={"Camaro","Corette","Tesla"};
        cars[0]="Mustang";
        System.out.println(cars[0]);
        
        //additional way of writing an array
        String[] arr=new String[3];
        arr[0]="Prabesh";
        arr[1]="Bista";
        arr[2]="Rocky";

        System.out.println(arr[2]);

        for(int i=0;i<arr.length;++i){
            System.out.println(arr[i]);

        }

        // 2D-array
        String[][] places=new String[3][3];
        places[0][0]="Nepal";
        places[0][1]="USA";
        places[0][2]="Aus";
        places[1][0]="Russia";
        places[1][1]="U.K";
        places[1][2]="France";
        places[2][0]="Portugal";
        places[2][1]="China";
        places[2][2]="Japan";
        
      

        for(int i=0;i<places.length;++i){
            System.out.println();
            for(int j=0;j<places.length;++j){
                System.out.print(places[i][j]+" ");

            }
        }

        // 3-D Array
        int[][][] arr3D={
            {
                {1,2},
                {3,4},
                {5,6}
            },
            {
                {7,8},
                {9,10},
                {11,12}
            }
        };
        
        System.out.print(arr3D[1][0][1]);

        // for(int i=0;i<2;i++){
        //     System.out.println();
        //     for(int j=0;j<3;i++){
        //         System.out.println();
        //         for(int k=0;k<2;i++){
        //             System.out.print(arr3D[i][j][k]);
        //         }
        //     }
        // }
    }    
}
