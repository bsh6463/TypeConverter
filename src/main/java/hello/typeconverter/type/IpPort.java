package hello.typeconverter.type;

import lombok.Getter;

@Getter
//field값이 모두 같으면 같은애로 처리.
public class IpPort {

    private String ip;
    private int port;

    public IpPort(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }


}
