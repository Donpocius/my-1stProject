public class Main {

    private static final String START_TAG = "class=\"announcement-title\">";

    public static void main(String[] args) {

        HtmlFetching fetcher = new HtmlFetching();

       StringBuilder html = fetcher.readContent("https://autoplius.lt/skelbimai/naudoti-automobiliai/bmw?category_id=3&page_nr=1");

//        System.out.println(html);

        String htmlStr = html.toString();

        int startIndex = htmlStr.indexOf(START_TAG);

        htmlStr = htmlStr.substring(startIndex +START_TAG.length() );

        //System.out.println(htmlStr);

        int minCharIndex = htmlStr.indexOf('<');


       String skelbimoTitle = htmlStr.substring(0, minCharIndex);

       // System.out.println("[" + skelbimoTitle + "]");

        skelbimoTitle = skelbimoTitle.trim();

        String [] titleData = skelbimoTitle.split(",");


        System.out.println(titleData[0]);
        System.out.println(titleData[1]);
        System.out.println(titleData[2]);

    }
}
