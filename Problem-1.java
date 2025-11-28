class Sample {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b;
        String s;
        System.out.print("Calculator");
        System.out.print("if you enter only the numbers otherwise it exits");
        boolean bo=true;
        while(bo)
        {
            try{
            System.out.println("Enter the number1 0-9:");
            a=sc.nextDouble();
            System.out.println("Enter the number2 0-9:");
            b=sc.nextDouble();
            System.out.println("Enter the operator like +,-,*,/ ");
            s=sc.next();
            
            if(!s.equals("+")&&!s.equals("-")&&!s.equals("*")&&!s.equals("/"))
            {
                System.out.println("you enter other operator enter like +,-,*,/ ");
                System.out.println("other wish it exits");
                System.out.println("Enter the operator like +,-,*,/ ");
                s=sc.next();
            }

            switch(s)
            {
                case "+":
                    System.out.println("Sum of "+a+"and"+b+"="+""+(a+b));
                    break;
                case "-":
                    System.out.println("Sub of "+a+"and"+b+"="+(a-b));
                    break;
                 case "*":
                    System.out.println("Mul of "+a+"and"+b+"="+(a*b));
                    break;
                case "/":
                    System.out.println("Div of "+a+"and"+b+"="+(a/b));
                    break;
                default:
                    bo=!bo;
            }
            
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception you not enter out of number like letters,symbels in num1,num2"+e);
            
        }
        }
        System.out.print("Exit it");
        sc.close();
    }
}
