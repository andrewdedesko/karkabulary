namespace Karkabulary.Models.Countdown {
    public class Countdown {
        public string Title { get; }
        public int Days { get; }
        public int Hours { get; }
        public int Minutes { get; }

        public Countdown(string title, int days, int hours, int minutes) {
            Title = title;
            Days = days;
            Hours = hours;
            Minutes = minutes;
        }
    }
}
