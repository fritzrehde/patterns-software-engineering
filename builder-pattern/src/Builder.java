// Abstract Builder
// TODO: improvement: Builder<T> will always be used as Builder<Pizza>/PizzaBuilder, as "steps" aren't generic
public interface Builder<T> {
	Builder<T> buildDough();
	Builder<T> buildSauce();
	Builder<T> buildTopping();
	Builder<T> reset();
	T getResult();
}
