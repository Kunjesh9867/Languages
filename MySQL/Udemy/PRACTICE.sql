SELECT COUNT(*) FROM books;

select * from books;

SELECT released_year,  COUNT(*) FROM books
GROUP BY released_year;

SELECT sum(books.stock_quantity) FROM books;


SELECT CONCAT(author_fname, ' ', author_lname)as name, pages FROM books
WHERE pages = (SELECT max(pages) FROM books);


select released_year, COUNT(book_id), avg(pages) from books
group by released_year
order by released_year;