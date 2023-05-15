public class sumOfArray {
    public static void main(String[] args) {
        
        int[] arr1={1,2,4,2,4,5};
        int[] arr2={9,9,1,1,1,1,1};


        int size1=arr1.length;
        int size2=arr2.length;

        int size3=Math.max(size1,size2);

        int[] res=new int[size3];

        int p1=arr1.length-1;
        int p2=arr2.length-1;
        int p3=res.length-1;

        int carry =0;

        while(p1>=0 || p2>=0){

            int val1=p1>=0 ? arr1[p1] : 0;
            int val2=p2>=0 ? arr2[p2] : 0;

            int sum=val1 + val2 + carry ;

            int digit=sum%10;
             carry = sum/10;
            res[p3]=digit;

            p1--;
            p2--;
            p3--;



        }


        if(carry!=0){

            int[] res2=new int[size3+1];
            res2[0]+=carry;

            for(int i=0;i<size3;i++){
                res2[i+1]=res[i];
            }

            for(int i=0;i<size3+1;i++){
                System.out.print(res2[i] + "  ");
            }
            return;
            
        }

        for(int i=0;i<size3;i++){
            System.out.print(res[i] + "  ");
        }
        


          
       
    }
}
