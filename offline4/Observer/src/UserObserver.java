public class UserObserver extends Observer {
        NetworkUtil nc;
        public UserObserver(NetworkUtil nc){
            this.nc=nc;
        }

        public NetworkUtil getNc() {
            return nc;
        }

        @Override
        public void update(String message) {
            nc.write( new Information("User notification : "+message ));
        }

        @Override
        public void subscribe(StockSubject subject) {
            subject.subscribe(this);
        }

        @Override
        public void unsubscribe(StockSubject subject) {
            subject.unsubscribe(this);
        }

}
