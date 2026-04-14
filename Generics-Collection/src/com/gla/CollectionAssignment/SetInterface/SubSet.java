class Subset {
    public static <T> boolean isSubset(Set<T> small, Set<T> big) {
        return big.containsAll(small);
    }
}