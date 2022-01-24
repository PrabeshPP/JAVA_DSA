package inheritance;

public class Box {
   int length;
   int breadth;
   int width;

   Box(int l,int b,int w){
       this.length=l;
       this.breadth=b;
       this.width=w;
   }

   Box(){
       this.length=-1;
       this.width=-1;
       this.breadth=-1;
   }

   Box(Box box){
       this.length=box.length;
       this.breadth=box.breadth;
       this.width=box.width;
   }


}



