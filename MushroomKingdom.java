//An example that lets us make and use some private variables to use within the Mushroom Kingdom

public class MushroomKingdom{

    // private variables 
    private String Mario;
    private String Luigi;
    private String Toad;
    private String Wario;
    private String Waluigi;
    private String Bowser;
    private String Yoshi;
    private String Peach;
    private String Daisy;
    private String Rosalina;
    private String Goomba;
    private int coins;
    private int totalStars;
    private int health;
    private int score;
    private double playtime;
    private String playerName;
    private String playerType;
    private String playerBuild;

    // getters for private Mushroom kingdom variables

    public String getMario(){
        return Mario;
    }

    public String getLuigi(){
        return Luigi;
    }

    public String getToad(){
        return Toad;
    }

    public String getWario(){
        return Wario;
    }

    public String getWaluigi(){
        return Waluigi;
    }

    public String getBowser(){
        return Bowser;
    }

    public String getYoshi(){
        return Yoshi;
    }

    public String getPeach(){
        return Peach;
    }

    public String getDaisy(){
        return Daisy;
    }

    public String getRosalina(){
        return Rosalina;
    }

    public String getGoomba(){
        return Goomba;
    }

    public int getCoins(){
        return coins;
    }

    public int getTotalStars(){
        return totalStars;
    }

    public int getHealth(){
        return health;
    }

    public int getScore(){
        return score;
    }

    public double getPlayTime(){
        return playtime + 1;
    }

    public String getPlayerName(){
        return playerName;
    }

    public String getPlayerType(){
        return playerType;
    }

    public String getPlayerBuild(){
        return playerBuild;
    }


    // setters for private Mushroom kingdom variables
    public void setMario(String Mario){
        this.Mario = Mario;
    }

    public void setLuigi(String Luigi){
        this.Luigi = Luigi;
    }

    public void setToad(String Toad){
        this.Toad= Toad;
    }

    public void setWaro(String Wario){
        this.Wario = Wario;
    }

    public void setWaluigi(String Waluigi){
        this.Waluigi = Waluigi;
    }

    public void setBowser(String Bowser){
        this.Bowser = Bowser;
    }

    public void setYoshi(String Yoshi){
        this.Yoshi = Yoshi;
    }

    public void setPeach(String Peach){
        this.Peach = Peach;
    }

    public void setDaisy(String Daisy){
        this.Daisy = Daisy;
    }

    public void setRosalina(String Rosalina){
        this.Rosalina = Rosalina;
    }

    public void setGoomba(String Goomba){
        this.Goomba= Goomba;
    }

    public void setCoins(int coins){
        this.coins = coins;
    }

    public void setTotalStars(int totalStars){
        this.totalStars = totalStars;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setScore(int score){
        this.score = score;
    }

    public void setPlayTime(double playtime){
        this.playtime = playtime;
    }

    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }

    public void setPlayerType(String playerType){
        this.playerType = playerType;
    }

    public void setPlayerBuild(String playerBuild){
        this.playerBuild = playerBuild;
    }
}