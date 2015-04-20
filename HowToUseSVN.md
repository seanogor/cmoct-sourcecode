I'll give a quick overview of how to use SVN. Once the source code is checked out you will notice that the folder has a green tick next to it. This lets you know if the code is in sync with the repository. When you right click on the folder you will notice now that the menu has changed again. You will see two key new options
Svn Update  - This brings down the latest changes from the repository to your computer
Svn Commit - This pushes your changes up to the repository

To see how this works, go into the folder, you should see lots of files and folder (src, lib, icon....). Create a new file called yourname.txt. You should see that I already have one called joey.enfield.txt, open this file with notepad and just add any bit of text to it and save it. Then go back up one directory and right click on Cmoct Project again and now click SVN Commit...

A new window will popup, it has two sections.
The top section is used to log a message on whats changes you have made to the repository. It is always a good idea to put in some quick comments about what you've done.

The bottom section lists all that files that you have changed since your last commit.
you should see two files listed here,
One file is the joey.enfield.txt (it will have a tick next to it)
your file that you created there (it will not have a tick, new files by default do not).

The ticks indicate what changes you want to commit to the repository.
Here you can put the tick in the new file to commit it. Another interseting thing that you can do here is that you can right click on a file that has changed, you get several options but click compare with base.
This pops up a window that shows you what has changed in the file which can be usefull.

Once your happy with what you want to commit click ok. At this point it might ask you for a password.
This is NOT your google password, its a new password for the repository. You can get this by clicking on
http://code.google.com/p/cmoct-sourcecode/
Then click on SOURCE, you will see

When prompted, enter your generated googlecode.com password.

Click the link and it will show your password to use at this stage.

Use that password and click ok, and you should commit your changes to the repository.

it is good practice to always run a SVN update  before you start working on anything
just incase something has changed in the repository since your last checked out your code.

Also when you change something always commit it. Dont be afraid to because it keeps all changes that have ever happened to the repository, so you can always go back if something breaks. You can even look at these. To have a look at all the commits that have happened, to have a look right click on the project folder (Cmoct Project), see the TortoiseSVN sub menu, select Show Log. It will show the full history of all changes that have been commited to the project, you can see what files were changed in each commit too and the comments.

Anyhow this is useful to tracking changes. Thats the basics of SVN.