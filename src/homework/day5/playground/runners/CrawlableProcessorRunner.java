package homework.day5.playground.runners;

import homework.day5.playground.essence.creatures.*;
import homework.day5.playground.processors.CrawlableProcessor;

public class CrawlableProcessorRunner {

    public static void main(String[] args) {

        CrawlableProcessor crawlableProcessor = new CrawlableProcessor();

        Crawlable crawlableCrocodile = new Crocodile(1723, "Neel Crawlable");
        Crawlable crawlableBeetle = new Beetle(43, "Christmas Crawlable");
        Vertebrata vertebrataCrocodile = new Crocodile(1723, "Neel Vertebrata");
        Insect insectBeetle = new Beetle(43, "Christmas Insect");
        Crocodile aCrocodile = new Crocodile(1723, "Neel Crocodile");
        Beetle aBeetle = new Beetle(43, "Christmas Beetle");
        Crawlable anonymousCrawlable = new Crawlable() {
            String name = "Anonymous";
            public String getName() {
                return "";
            }
            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        };

        crawlableProcessor.runCrawlable(crawlableCrocodile);
        crawlableProcessor.runCrawlable(crawlableBeetle);
//        Vertebrata class doesn't implement Crawlable interface
//        crawlableProcessor.runCrawlable(vertebrataCrocodile);
//        Insect class doesn't implement Crawlable interface
//        crawlableProcessor.runCrawlable(insectBeetle);
        crawlableProcessor.runCrawlable(aCrocodile);
        crawlableProcessor.runCrawlable(aBeetle);
        crawlableProcessor.runCrawlable(anonymousCrawlable);

        crawlableProcessor.runCrawlable(crawlableCrocodile, "nowhere");
        crawlableProcessor.runCrawlable(crawlableBeetle, "left");

        crawlableProcessor.runCrawlable(crawlableCrocodile, "back", 37);

        crawlableProcessor.runCrawlable(new Crawlable() {
            String name = "Gena Random";
            public String getName() {
                return "";
            }
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        }, "down", 37);
    }
}
