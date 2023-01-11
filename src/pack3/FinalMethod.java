package pack3;

public class FinalMethod {

  public static void main(String[] args) {
    WorldChess w = new WorldChess();
    w.getFirstPlayer();
  }

}


class Chess {

  enum ChessPlayer {
    WHITE, BLACK
  }

  final ChessPlayer getFirstPlayer() {//오버라이드 할 수 없음
    return ChessPlayer.WHITE;
  }

}

class WorldChess extends Chess {


}