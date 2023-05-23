public void takeRisk() throws BadException{
    if (abandonAllHope){
        throw new BadException();
    }
}

//The method takeRisk() is defined with a 'throws' clause, indicating that it may throw a checked
//exception of type 'BadException'
//the condition 'if (abandonAllHope)' checks a boolean variable 'abandonAllHope'. If the condition
//is true, it throws a 'BadException' by using the 'throw ' keyword


public void crossFingers(){
    try{
        anObject.takeRisk();
    } catch (BadException e){
        System.out.println("Aaargh!");
        e.printStackTrace();
    }
}