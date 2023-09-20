class interviewQuestion {
    public static void main(String[] args) {
        System.out.println(mathFunction(1, 2, 3));
        System.out.println(mathFunction(2, 2, 4));
        System.out.println(mathFunction(3, -3, -9));
        System.out.println(mathFunction(1, 2, -1));
        System.out.println(mathFunction(3, 3, 1));
        System.out.println(mathFunction(7, 1, 11));
    }
    private static String mathFunction(int num1, int num2, int num3){
        String ans = "";
        if(num1+num2==num3){
            ans += "+";
        } 
        if(num1-num2==num3){
            ans +="-";
        }
        if(num1*num2==num3){
            ans +="*";
        }
        if(num1/num2==num3){
            ans +="/";
        }
        if(ans == ""){
            ans+= "None";
        }
        return ans;
    } 
}