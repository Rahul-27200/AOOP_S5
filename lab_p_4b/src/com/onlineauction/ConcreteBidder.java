package com.onlineauction;

public class ConcreteBidder implements Bidder {
    private String name;

    public ConcreteBidder(String name) {
        this.name = name;
    }

    @Override
    public void update(AuctionEvent event, String item) {
        switch (event) {
            case ITEM_AVAILABLE:
                System.out.println(name + " notified: Item " + item + " is available.");
                break;
            case BIDDING_STARTED:
                System.out.println(name + " notified: Bidding started for " + item + ".");
                break;
            case BIDDING_ENDED:
                System.out.println(name + " notified: Bidding ended for " + item + ".");
                break;
        }
    }
}
