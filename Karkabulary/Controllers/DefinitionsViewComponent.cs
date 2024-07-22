using Karkabulary.Models.Definitions;
using Microsoft.AspNetCore.Mvc;

namespace Karkabulary.Controllers {
    public class DefinitionsViewComponent : ViewComponent {
        private static IEnumerable<Definition> definitions = new List<Definition>() {
                new Definition("Dirty Ho-Dog", DefinitionType.Thing, "Hot Dog"),
                new Definition("Bony boy", DefinitionType.Thing, "Bone Shaker"),
                new Definition("Black market boy", DefinitionType.Phrase, "Black market haircut"),
                new Definition("Have a third boy", DefinitionType.Phrase, "Have a third beer."),
                new Definition("Double burner method", DefinitionType.Phrase, "Using the two large stove burners to heat a single pot or pan because a single burner doesn't produce enough heat.  Both burners are turned on to max, then Andrew alternates the pot between burners."),
                new Definition("T-dizzler", DefinitionType.Phrase, "The CN Tower."),
                new Definition("Ahhhhhh sweet babies", DefinitionType.Phrase, "An expression of exhaustion."),
                new Definition("Demo a bag of dirty reets", DefinitionType.Phrase, "Demolish a bag of Doritos.  To eat a bag of Doritos."),
                new Definition("HAZEL WHO'S A DOG??!", DefinitionType.Phrase, "Common topic of conversation with Ms. Hazel."),
                new Definition("Annie's", DefinitionType.Thing, "The good brand of mac and cheese.  Andrew has a weird ability to live off mac and cheese and other carbs."),
                new Definition("Slam a hot dog", DefinitionType.Phrase, "Eat a hot dog.  Likely without a bun."),
                new Definition("Starts screaming", DefinitionType.Action, "Likely spilled a small amount of water."),
                new Definition("Want me to overflow the coffee maker?", DefinitionType.Phrase, "When Andrew makes coffee, the coffee maker often overflows.  Asking whether you'd like him make coffee and cause an overflow."),
                new Definition("Waffelhut", DefinitionType.Phrase, "German word for 'waffle hat' but used to refer to regular waffles."),
                new Definition("I recommend using only the finest stolen waffle makers", DefinitionType.Phrase, "The waffle maker was stolen from a previous job."),
                new Definition("Overneath", DefinitionType.Phrase, "Amalgamation of over and underneath.  As in 'I put my sweater on overneath my shirt.'"),
                new Definition("Boy", DefinitionType.Phrase, "Synonym for any noun."),
                new Definition("Put a boy in the boy", DefinitionType.Phrase, "Put food in the deep fryer."),
                new Definition("Put some brown boys in the toaster", DefinitionType.Phrase, "Put some buns in the toaster.")
        };

        public async Task<IViewComponentResult> InvokeAsync() {
            return View(definitions);
        }
    }
}
