try{
    turnOvenOn();
    x.bake();
} catch(BakingException e){
    e.printStackTrace();
}finally{
    turnOvenOff();
}