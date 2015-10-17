# Better IntelliJ File Templates

Code generation file templates for the IntelliJ IDEA IDE,
written with best-practices in mind.

## Installation

Installation is a little tricky
because IntelliJ automatically recreates non-existent templates.
To change a default template, it has to be overridden.
By corollary, unless IntelliJ was only recently installed
you will probably have to decide whether any of the current templates
need to be kept.

Template files are read from `config/fileTemplates/`
in the global IntelliJ configuration directory,
for instance `~/.IntelliJIdea14/`,
when IntelliJ starts.
The templates are cached until either IntelliJ is restarted or
a template is modified from within IntelliJ,
so they can't be modified outside of IntelliJ while the IDE is running.

To restore a default template,
simply remove the corresponding file from the above location.

### Manually copy the template directory or the template files

This is the recommended method.

The nature of this repository is such that files should rarely if ever change,
so there is very low pressure to be able to stay up to date.
Additionally, this will give you the freedom
to modify templates without cluttering the repository.
The downside is the extra work required to record changes.

If you don't care about any existing templates,
for instance if you have made no modifications already,
you can simply remove the original directory and copy in the one from here:

```sh
rm -rf ~/.IntelliJIdea14/config/fileTemplates
cp -r fileTemplates ~/.IntelliJIdea14/config/
```

Otherwise, copy files individually,
but retain the directory structure laid out here.

### Make a symbolic link to the template directory

As a parallel to the above method,
instead of copying this directory to the appropriate location,
a symbolic link can be made instead.
The advantage of this approach is that changes automatically propagate to the
repository.
The disadvantage is that changes automatically propagate to the repository.
This method is only recommended
either if you are actively adjusting templates (so changes propagate)
or if you never expect to change them (so there is no clutter).

```sh
rm -rf ~/.IntelliJIdea14/config/fileTemplates
ln -s $PWD/fileTemplates ~/.IntelliJIdea14/config/
```

### Make symbolic links to individual templates

By making symbolic links only to those templates that are deemed relevant,
these are automatically kept up to date and
the repository is not cluttered with changes to other templates.

This is the most robust solution, but also by far the most tedious one.

```sh
ln -s $PWD/fileTemplates/internal/Class.java \
    ~/.IntelliJIdea14/config/fileTemplates/internal/
```

## Motivation

I have yet to see an IDE whose included code generation templates
made a point of reflecting established best-practices.
Worse, the people most helped by these templates
tend to have an underdeveloped sense of best-practices
and will trust the IDE out of necessity.
IDEs have an inescapable pedagogical function,
and so are ethically responsible for promoting best-practices,
yet none seem to care.

IntelliJ is no different.

Further, [JetBrains has formally rejected this problem][no-final-classes],
citing configuration-over-convention as preferable to
annoyance born out of ignorance.
Even though the history of software development
is rich in examples of bad software born out of configuration-over-convention,
due largely to uncritical use of software even by professionals.

[no-final-classes]: https://youtrack.jetbrains.com/issue/IDEA-125647
