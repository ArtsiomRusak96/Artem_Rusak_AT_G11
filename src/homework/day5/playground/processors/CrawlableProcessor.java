package homework.day5.playground.processors;

import homework.day5.playground.essence.creatures.Crawlable;
import homework.day5.playground.utils.DirectionGenerator;
import homework.day5.playground.utils.DistanceGenerator;

public class CrawlableProcessor {

    public void runCrawlable(Crawlable crawlable) {
        crawlable.crawl(DirectionGenerator.generateDirection(), DistanceGenerator.generateDistance());
    }

    public void runCrawlable(Crawlable crawlable, String direction, int distance) {
        crawlable.crawl(direction, distance);
    }
}
