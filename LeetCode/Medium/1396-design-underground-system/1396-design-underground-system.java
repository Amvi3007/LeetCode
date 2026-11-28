class UndergroundSystem {
    public class CheckIns{
        int time;
        String Starting_station;
        CheckIns(int time,String Starting_station){
            this.time = time;
            this.Starting_station = Starting_station;
        }
    }
    public class Route{
        int trips;
        int total_time;
        Route(){
            this.trips = 0;
            this.total_time = 0;
        }
    }
    HashMap<Integer,CheckIns> checkin;
    HashMap<String,Route> route;
    public UndergroundSystem() {
        checkin = new HashMap<>();
        route = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkin.put(id,new CheckIns(t,stationName));
    }
    
    public void checkOut(int id, String stationName, int t) {
        CheckIns user = checkin.get(id);
        String statn = user.Starting_station+"->"+stationName;
        int total_time = t - user.time;
        if(!route.containsKey(statn)){
            route.put(statn,new Route());
        }
        Route r = route.get(statn);
        r.total_time+=total_time;
        r.trips+=1;
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String st = startStation+"->"+endStation;
        int total_time = route.get(st).total_time;
        int trips = route.get(st).trips;
        return (double) total_time/trips;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */