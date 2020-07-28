package com.karkabulary.web.definition;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;

public class MockDefinitionService implements DefinitionService {
    @Override
    public ImmutableList<Definition> getDefinitions() {
        final var definitions = new ArrayList<Definition>();

        definitions.add(new Definition(
                "Ahhhhhh sweet babies",
                DefinitionType.Phrase,
                "An expression of exhaustion."
        ));

        definitions.add(new Definition(
                "Demo a bag of dirty reets",
                DefinitionType.Phrase,
                "Demolish a bag of Doritos.  To eat a bag of Doritos."));

        definitions.add(new Definition(
                "HAZEL WHO'S A DOG??!",
                DefinitionType.Phrase,
                "Common topic of conversation with Ms. Hazel."
        ));

        definitions.add(new Definition(
                "Annie's",
                DefinitionType.Thing,
                "The good brand of mac and cheese.  Andrew has a weird ability to live off mac and cheese and other carbs."
        ));

        definitions.add(new Definition(
                "Slam a hot dog",
                DefinitionType.Phrase,
                "Eat a hot dog.  Likely without a bun."
        ));

        definitions.add(new Definition(
                "Starts screaming",
                DefinitionType.Action,
                "Likely spilled a small amount of water."
        ));

        definitions.add(new Definition(
                "Want me to overflow the coffee maker?",
                DefinitionType.Phrase,
                "When Andrew makes coffee, the coffee maker often overflows.  Asking whether you'd like him make coffee and cause an overflow."
        ));

        definitions.add(new Definition(
                "Waffelhut",
                DefinitionType.Phrase,
                "German word for 'waffle hat' but used to refer to regular waffles."
        ));

        definitions.add(new Definition(
                "I recommend using only the finest stolen waffle makers",
                DefinitionType.Phrase,
                "The waffle maker was stolen from a previous job."
        ));

        definitions.add(new Definition(
                "Overneath",
                DefinitionType.Phrase,
                "Amalgamation of over and underneath.  As in 'I put my sweater on overneath my shirt.'"
        ));

        definitions.add(new Definition(
                "Boy",
                DefinitionType.Phrase,
                "Synonym for any noun."
        ));

        definitions.add(new Definition(
                "Put a boy in the boy",
                DefinitionType.Phrase,
                "Put food in the deep fryer."
        ));

        definitions.add(new Definition(
                "Put some brown boys in the toaster",
                DefinitionType.Phrase,
                "Put some buns in the toaster."
        ));

        return ImmutableList.copyOf(definitions);
    }
}
