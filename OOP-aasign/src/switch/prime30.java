public class prime30 {
        public static void main(String[] args) {
            for (int num = 1;num<=30;num++){
                int count = 0;
                for (int i = 1;i<=num;i++){
                    if (num%i==0){
                        count = count+1;
                    }
                }
                if (count==2){
                    System.out.println(num);
                }

            }

        }
    }

