using Karkabulary.Models.Countdown;
using Microsoft.AspNetCore.Mvc;

namespace Karkabulary.Controllers {
    public class YearlyEventCountdownViewComponent : ViewComponent {
        public IViewComponentResult Invoke(string title, int month, int day) {
            var now = DateTime.Now;

            DateTime nextEvent;
            if(month == now.Month && day == now.Day) {
                nextEvent = now;
            } else if(month > now.Month || (month == now.Month && day > now.Day)) {
                nextEvent = new DateTime(now.Year, month, day);
            } else {
                nextEvent = new DateTime(now.Year + 1, month, day);
            }

            var timeRemaining = nextEvent - now;
            var countdownData = new Countdown(title, (int)Math.Floor(timeRemaining.TotalDays), timeRemaining.Hours, timeRemaining.Minutes);
            return View(countdownData);
        }
    }
}
