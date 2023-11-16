package Weekend_7.Nested_class;

import javax.swing.plaf.basic.BasicDesktopIconUI;

public abstract class Player {
    private String name ;
    private int jerseyNumber ;
    protected int speed ;
    Player(String name,int jerseyNumber,int speed)
    {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.speed = speed;
    }
  public static class Builder
  {
      private String name;
      private int jerseynumber;
      private int speed;
      private String Player_type;
      public Builder setName(String name)
      {
          this.name = name;
          return this;
      }
      public Builder setPlayerType(String type)
      {
          this.Player_type = type;
          return this;
      }
      public Builder setJerseyNumber(int jerseyNumber)
      {
          this.jerseynumber = jerseyNumber;
          return this;
      }
      public Builder  setSpeed(int speed)
      {
          this.speed = speed;
          return this;
      }
      public Player build()
      {
          if(Player_type == "forward")
          {
              return new Forward(name,jerseynumber,speed);
          }
          else if(Player_type == "midfielder")
          {
              return new MidFielder(name,jerseynumber,speed);
          }
          else {
              return new Defender(name,jerseynumber,speed);
          }
      }
  }
    @Override
    public String toString()
    {
        return "Player Name='"+this.name+", jJerseyNumber="+this.jerseyNumber+", SPEED="+this.speed+",";
    }
    protected abstract int getSpeed() ;
}