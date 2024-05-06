public class Startsida {

    public static void main(String[] args) throws Exception {

        System.out.println("\r\n" + //
                "   ___       __         _                            __          \r\n" + //
                "  / _ )___  / /__ ___  (_)__  ___ ____ ___ __ _____ / /____ __ _ \r\n" + //
                " / _  / _ \\/  '_// _ \\/ / _ \\/ _ `(_-<(_-</ // (_-</ __/ -_)  ' \\\r\n" + //
                "/____/\\___/_/\\_\\/_//_/_/_//_/\\_, /___/___/\\_, /___/\\__/\\__/_/_/_/\r\n" + //
                "                            /___/        /___/                   \r\n" + //
                "");
        Thread.sleep(2000);
        System.out.println(System.lineSeparator().repeat(50));
        System.out.println("\r\n" + //
                "  _   ___  _ ____                             __\r\n" + //
                " | | / (_)(_) / /_____  __ _  __ _  ___ ___  / /\r\n" + //
                " | |/ / _ `/ /  '_/ _ \\/  ' \\/  ' \\/ -_) _ \\/_/ \r\n" + //
                " |___/\\_,_/_/_/\\_\\\\___/_/_/_/_/_/_/\\__/_//_(_)  \r\n" + //
                "                                                \r\n" + //
                "");
        Thread.sleep(2000);
        System.out.println(System.lineSeparator().repeat(50));
        Bokningssystem.main(args);

    }
}