# MedspaCy Pneumonia NLP
Flexible NLP pipeline for identifying pneumonia in across clinical settings and institutions implemented using medspaCy.

## Overview
This package implements a [medspaCy](https://github.com/medspacy/medspacy) pipeline for classifying pneumonia diagnoses
in 3 types of clinical notes:
- Emergency note
- Radiology report
- Discharge summary

The system was primarily designed in Veterans Affairs and was then validated in
University of Utah. Rules designed for University of Utah's Epic EHR are provided and can be
 added to the pipeline. Custom rules can be designed and added in a similar manner. 
See `notebooks/` for detailed documentation and examples.

This work was published in December 2022 in JAMIA Open: ["Development and evaluation of an interoperable natural language processing system for identifying pneumonia across clinical settings of care and institutions"](https://academic.oup.com/jamiaopen/article/5/4/ooac114/6965695?login=false). Supplemental materials for the manuscript can be found on the journal webiste or here under `supplemental_materials/`.

## Quickstart
### Installation
```bash
pip install medspacy_pna
```

Or:
```bash
python setup.py install
```
You will also need to install spaCy's `en_core_web_sm` model (or specify a different model
when loading the NLP)

```bash
python -m spacy download en_core_web_sm
```
### Usage

```python
from medspacy_pna import build_nlp
from medspacy_pna.display import create_html
from IPython.display import HTML

# Load a model specific to either "emergency", "radiology", or "discharge"
nlp_emergency = build_nlp(domain="emergency")
note_emergency = """
History of Present Illness: Patient presents to ED with cough and fever.

Medical decision making: Differential diagnoses include pna and CHF. 
Will order a chest x-ray to r/o pneumonia.

Assessment/Plan:
Admit for suspected community-acquired pneumonia.
"""
doc_emergency = nlp_emergency(note_emergency)
HTML(create_html(doc_emergency, "emergency", document_classification=True))
```
![Processed emergency note](./images/processed_emergency.PNG)
