import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class PCAP_read {
    static int pos = 0;

    static char[] hex = new char[]{
            '0', '1', '2', '3', '4', '5', '6',
            '7', '8', '9',
            'A', 'B', 'C', 'D',
            'E', 'F'};

    static int[] hexI = new int[]{
            0, 1, 2, 3, 4, 5, 6,
            7, 8, 9,
            10, 11, 12, 13,
            14, 15};

    static int Chet = 0;

    public static void main(String[] args) throws IOException {
        int Chet = 0;
        DatagramSocket socket = new DatagramSocket();
        String FileN = "C:\\\\PCAP\\dl360p_9609.dat";
        String FileOut = "C:\\\\PCAP\\out.pcap";
        OutputStream fileOut = new FileOutputStream(FileOut);
        FileInputStream file = new FileInputStream(FileN);
        byte[] helo = new byte[50000000];
        file.read(helo);
        ReadHeader(helo);
        while (helo[pos] != 0 || helo[pos + 1] != 0) {
            int Leng = ReadRecordHeader(helo);
            Leng -= ReadL2data(helo);
            Leng -= ReadL3data(helo);
            Leng -= ReadL4data(helo);
            System.out.println(Leng);
            WritePacket(Integer.valueOf(Leng), helo, socket);
        }
        file.close();
        fileOut.close();
    }

    public static int ReadHeader(byte[] MasB) {
        System.out.print("Header : ");
        for (int i = pos; i < pos + 24; i++) {
            byte look = MasB[i];
            System.out.print(hex[look >> 4 & 0xF]);
            System.out.print(hex[look & 0xF]);
            if ((i + 1) % 2 == 0)
                System.out.print(" ");
        }
        pos += 24;
        System.out.println("");
        return 24;
    }

    public static int ReadRecordHeader(byte[] MasB) {
        System.out.print("Record Header : ");
        System.out.print(hex[MasB[pos + 8] >> 4 & 0xF]);
        System.out.println(hex[MasB[pos + 8] & 0xF]);
        int Leng = ((MasB[pos + 11] & 0xFF) << 24) + ((MasB[pos + 10] & 0xFF) << 16) + ((MasB[pos + 9] & 0xFF) << 8) + (MasB[pos + 8] & 0xFF);
        System.out.println(Leng);
        for (int i = pos; i < pos + 16; i++) {
            byte look = MasB[i];
            System.out.print(hex[look >> 4 & 0xF]);
            System.out.print(hex[look & 0xF]);
            if ((i + 1) % 2 == 0)
                System.out.print(" ");
        }
        pos += 16;
        System.out.println("");
        return Leng;
    }

    public static int ReadL2data(byte[] MasB) {
        System.out.print("L2 : ");
        for (int i = pos; i < pos + 14; i++) {
            byte look = MasB[i];
            System.out.print(hex[look >> 4 & 0xF]);
            System.out.print(hex[look & 0xF]);
            if ((i + 1) % 2 == 0)
                System.out.print(" ");
        }
        pos += 14;
        System.out.println("");
        return 14;
    }

    public static int ReadL3data(byte[] MasB) {
        System.out.print("L3 : ");
        int Leng = (MasB[pos] & 0xF) << 2;
        for (int i = pos; i < pos + Leng; i++) {
            byte look = MasB[i];
            System.out.print(hex[look >> 4 & 0xF]);
            System.out.print(hex[look & 0xF]);
            if ((i + 1) % 2 == 0)
                System.out.print(" ");
        }
        pos += Leng;
        System.out.println("");
        return Leng;
    }

    public static int WritePacket(Integer leng, byte[] MasB, OutputStream out) throws IOException {
        System.out.print("Packet : ");
        byte[] LengB = IntToByte(leng.intValue());
        byte[] WritMas = new byte[leng.intValue() + 2];
        WritMas[0] = LengB[2];
        WritMas[1] = LengB[3];
        int i;
        for (i = 0; i < leng.intValue(); i++)
            WritMas[i + 2] = MasB[pos + i];
        for (i = 0; i < 20; i++) {
            byte look = WritMas[i];
            System.out.print(hex[look >> 4 & 0xF]);
            System.out.print(hex[look & 0xF]);
            if ((i + 1) % 2 == 0)
                System.out.print(" ");
        }
        out.write(WritMas);
        pos += leng.intValue();
        return 0;
    }

    public static int WritePacket(Integer leng, byte[] MasB, DatagramSocket Sok) throws IOException {
        System.out.print("Packet : ");
        byte[] LengB = IntToByte(leng.intValue());
        byte[] WritMas = new byte[leng.intValue()];
        int i;
        for (i = 0; i < leng.intValue(); i++)
            WritMas[i] = MasB[pos + i];
        for (i = 0; i < 20; i++) {
            byte look = WritMas[i];
            System.out.print(hex[look >> 4 & 0xF]);
            System.out.print(hex[look & 0xF]);
            if ((i + 1) % 2 == 0)
                System.out.print(" ");
        }
        DatagramPacket packet =
                new DatagramPacket(WritMas, WritMas.length,
                        InetAddress.getByName("192.168.221.40"), 9747);
        DatagramSocket socket = new DatagramSocket();
        socket.send(packet);
        pos += leng.intValue();
        Chet++;
        System.out.println("Number: " + Chet);
        return 0;
    }

    public static int ReadL4data(byte[] MasB) {
        System.out.print("L4 : ");
        int Leng = ((MasB[pos + 4] & 0xFF) << 8) + (MasB[pos + 5] & 0xFF);
        System.out.println(Leng);
        for (int i = pos; i < pos + 8; i++) {
            byte look = MasB[i];
            System.out.print(hex[look >> 4 & 0xF]);
            System.out.print(hex[look & 0xF]);
            if ((i + 1) % 2 == 0)
                System.out.print(" ");
        }
        pos += 8;
        System.out.println("");
        return 8;
    }

    public static byte[] IntToByte(int Look) {
        byte[] LookB = new byte[4];
        LookB[0] = (byte) (Look >> 24);
        LookB[1] = (byte) (Look << 8 >> 24);
        LookB[2] = (byte) (Look << 16 >> 24);
        LookB[3] = (byte) (Look << 24 >> 24);
        return LookB;
    }
}
