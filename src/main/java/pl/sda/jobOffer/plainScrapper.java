package pl.sda;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class plainScrapper {

    public static void main(String[] args) throws Exception {


        Document document = Jsoup.connect("https://justjoin.it/all/java/junior").get();

        for (Element jobOffer: document.getElementsByClass("jss221.jss2746")){

            String title = jobOffer.getElementsByClass("jss233").text();
//            String company = jobOffer.getElementsByClass("d-block").text();
//            String location = jobOffer.getElementsByClass("mr-1").text();
//            String link = jobOffer.attr("href");
//            String salary = jobOffer.getElementsByAttributeValue("data-cy", "salary ranges on the job offer listing").html().toString().replaceAll("&nbsp;","").trim();

//            List<String> result = null;
            System.out.println(title);
//            System.out.println(company);
//            System.out.println(location);
//            System.out.println("https://nofluffjobs.com"+link);
//            System.out.println(salary);
//
//            Pattern p = Pattern.compile("\\d+");
//            Matcher m = p.matcher(salary);
//            if(m.find()) {
////                System.out.println(m.group());
//                result = new ArrayList<String>();
//                result.add(m.group());
//                while (m.find()){
//                    result.add(m.group());
//                }
//            }
//            System.out.println(result);


            System.out.println("======================================================");
        }}}
//        for (Element jobOffer: document.getElementsByTag("nfj-search-results")){
//            List<String> nextButtons = jobOffer.getElementsByClass("page-link").stream().map(e -> e.text()).collect(Collectors.toList());;
//            System.out.println(nextButtons);
//            if(nextButtons.contains("??")){
//                System.out.println("nie dupa");
//            }else{
//                System.out.println("dupa");
//            }
//        }