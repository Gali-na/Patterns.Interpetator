public class Main {
    public static void main(String[] args) {

        Expression expressionJava = getJavaCoreDeveloper();
        Expression expressionJavaEE = getJavaEEDeveloper();
        System.out.println(expressionJavaEE.interpret("javaSpring"));

        System.out.println("Hello world!");
    }

    public static Expression getJavaCoreDeveloper() {
       Expression java= new TerminateExpression("java");
       Expression javaCore = new TerminateExpression("javaCore");
       return new AndExpression(java,javaCore);
    }
    public static Expression getJavaEEDeveloper() {
        Expression java= new TerminateExpression("java");
        Expression javaCore = new TerminateExpression("javaSpring");
        return new OrExpression(java,javaCore);
    }

}