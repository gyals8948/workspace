package class_basic.song;

public class Song {
    //Song 클래스는 다음과 같은 필드를 갖는다.
    //  - 노래 제목을 나타내는 title / - 가수를 나타내는 artist
    //  - 노래가 속한 앨범 제목을 나타내는 album /   - 노래가 발표된 연도를 나타내는 year
    //  - 노래의 작곡가를 나타내는 composer, 단 작곡가는 3명이라고 간주한다.

    String title;
    String artist;
    String album;
    int year;
    String[] composer;
    //여러명이다 = String[](배열)


    //모든 참조자료형은 기본 초기값이 null
    public void initSong(String title1, String artist1,
             String album1, int year1, String[] composer1){

        title = title1;
        artist = artist1;
        album  = album1;
        year = year1;
        composer = composer1;

    }
    public void printSong(){
        System.out.println("제목 : " + title);
        System.out.println("가수 : " + artist);
        System.out.println("엘범 : " + album);
        System.out.println("년도 : " + year);
        System.out.print("작곡가 : "  );

        for(int i = 0; i <composer.length; i++) {
            System.out.println(composer[i]);
        }
    }




}
