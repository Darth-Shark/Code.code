//Bucket class for CTE Software Development class 2024
//Much of code donated by Mr. Kim Gross

public class bucket {
    Card data;

    bucket next;

    public bucket(Card data){
    this.data=data;
    };

    public bucket (){}

    public Card getData(){
    return data;
    };

    public void setData(Card data){
    this.data=data;
    };
    
    public bucket getNext(){
    return next;

   };

   public void setTail(bucket temp){
    next = temp;
   };
}