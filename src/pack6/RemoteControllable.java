package pack6;

/**
 * @implSpec 리모트 온,오프 기능 인터페이스
 */
public interface RemoteControllable extends Controllable{
  void remoteOn();
  void remoteOff();
}
