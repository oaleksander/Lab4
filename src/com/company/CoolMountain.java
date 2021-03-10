package com.company;

public class CoolMountain extends Mountain implements StoneObject {
    public CoolMountain() {
        super(() -> "Куски горной породы");
    }
}
