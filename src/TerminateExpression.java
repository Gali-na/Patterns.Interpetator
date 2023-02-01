public class TerminateExpression implements Expression{
    public String data;

    public TerminateExpression(String context) {
        this.data = context;
    }
    @Override
    public boolean interpret(String context) {
        if(data.contains(context)){
            return  true;
        }
        return false;
    }
}
