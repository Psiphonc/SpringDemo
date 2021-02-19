package top.psiphonc.pojo;

public class Hello {
    private String str;

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Hello() {
    }

    public Hello(String str) {
        this.str = str;
    }
}
