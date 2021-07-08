from spacy.tokens import Token, Span, Doc

def set_extensions():
    "Set custom medspaCy extensions for Token, Span, and Doc classes."
    set_token_extensions()
    set_span_extensions()
    set_doc_extensions()

def set_token_extensions():
    for attr, attr_info in _token_extensions.items():
        try:
            Token.set_extension(attr, **attr_info)
        except ValueError as e: # If the attribute has already set, this will raise an error
            pass

def set_span_extensions():
    for attr, attr_info in _span_extensions.items():
        try:
            Span.set_extension(attr, **attr_info)
        except ValueError as e: # If the attribute has already set, this will raise an error
            pass

def set_doc_extensions():
    for attr, attr_info in _doc_extensions.items():
        try:
            Doc.set_extension(attr, **attr_info)
        except ValueError as e: # If the attribute has already set, this will raise an error
            pass


def get_anatomy(span):
    """Naive getter function for anatomy. If the span is modified by any anatomical locations, take the first one."""
    for modifier in span._.modifiers:
        if modifier.category == "LOCALIZED_ANATOMY":
            return modifier.span.text

def get_possible_existence(span):
    """Naive getter function for possible_existence. If the span is modified by any possible existence, take the first one."""
    for modifier in span._.modifiers:
        if modifier.category == "POSSIBLE_EXISTENCE":
            return modifier.span.text

def get_positive_existence(span):
    """Naive getter function where of the span is modified, take the first one."""
    for modifier in span._.modifiers:
        if modifier.category == "POSITIVE_EXISTENCE":
            return modifier.span.text

def get_decreased(span):
    """Naive getter function where of the span is modified, take the first one."""
    for modifier in span._.modifiers:
        if modifier.category == "DECREASED":
            return modifier.span.text

def get_increased(span):
    """Naive getter function where of the span is modified, take the first one."""
    for modifier in span._.modifiers:
        if modifier.category == "INCREASED":
            return modifier.span.text

def get_unchanged(span):
    """Naive getter function where of the span is modified, take the first one."""
    for modifier in span._.modifiers:
        if modifier.category == "UNCHANGED":
            return modifier.span.text

def get_improved(span):
    """Naive getter function where of the span is modified, take the first one."""
    for modifier in span._.modifiers:
        if modifier.category == "IMPROVED":
            return modifier.span.text

def get_worsened(span):
    """Naive getter function where of the span is modified, take the first one."""
    for modifier in span._.modifiers:
        if modifier.category == "WORSENED":
            return modifier.span.text

_span_extensions = {
    "anatomy": {"getter": get_anatomy},
    "is_possible_existence": {"getter": get_possible_existence},
    "is_positive_existence": {"getter": get_positive_existence},
    # some of these below we may not use in our present 2021 Pneumonia project, but since they are in Moonstone and could be helpful,
    # I have added these here
    "is_decreased": {"getter": get_decreased},
    "is_increased": {"getter": get_increased},
    "is_unchanged": {"getter": get_unchanged},
    "is_improved": {"getter": get_improved},
    "is_worsened": {"getter": get_worsened},
    "is_ignored": {"default": False},
}

_doc_extensions = {
    "document_classification": {"default": None},
}

_token_extensions = {

}