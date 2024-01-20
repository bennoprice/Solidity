public class Assembler {
    static public String PUSH(int bytes, String immediate) {
        assert immediate.length() == bytes * 2: "Assembler.PUSH: immediate length mismatch";
        var opcode = Integer.toHexString(0x5f + bytes);
        return opcode + immediate;
    }

    static public String DUP(int slot) {
        return Integer.toHexString(0x80 + slot - 1);
    }

    static public String ADD() {
        return String.format("%02x", 0x01);
    }

    static public String SSTORE() {
        return Integer.toHexString(0x55);
    }
}
