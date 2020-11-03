public class Catfish {
    private int column=1;
    private int energyLevel=10;
    public int getColumn(){
        return this.column;
    }
    public void swimRight(){
        if(this.column+1<=10){
            this.column+=1;
            this.energyLevel-=1;
        }
    }
    public String getImage(){
        if(this.energyLevel<5){
            return "./resource/img/CatFish-tired.gif";
        }
        return "./resource/img/CatFish.gif";
    }
}
