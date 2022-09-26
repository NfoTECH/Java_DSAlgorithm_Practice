package matrix;


import java.util.List;

public class PaginationHelper {
    public static void main(String[] args) {

    }

    class PaginationHelper1<I> {

        private final List<I> collection;
        private final int itemsPerPage;

        public PaginationHelper1(List<I> collection, int itemsPerPage) {
            this.collection = collection;
            this.itemsPerPage = itemsPerPage;
        }

        public int itemCount() {
            return collection.size();
        }

        public int pageCount() {
            double result = (double) collection.size() / itemsPerPage;
            return (int) Math.ceil(result);
        }

        public int pageItemCount(int pageIndex) {
            if (pageIndex < 0 || pageIndex >= pageCount()) return -1;
            if (pageIndex == pageCount() - 1) return collection.size() % itemsPerPage;
            return itemsPerPage;
        }

        public int pageIndex(int itemIndex) {
            if (itemIndex < 0 || itemIndex >= collection.size()) return -1;
            return itemIndex / itemsPerPage;
        }
    }
}
