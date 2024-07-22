namespace Karkabulary.Models.Definitions
{
    public class Definition {
        public string Term { get; private set; }
        public DefinitionType DefinitionType { get; private set; }
        public string Description { get; private set; }

        public Definition(string term, DefinitionType definitionType, string description) {
            Term = term;
            DefinitionType = definitionType;
            Description = description;
        }
    }

    public enum DefinitionType {
        Phrase,
        Thing,
        Action
    }
}
