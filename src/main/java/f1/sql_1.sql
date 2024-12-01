# Se requiere un listado de productos con sus precios, de aquellos productos cuyo modelo es 2016, ordenado alfabéticamente por nombre
SELECT product_name, list_price, model_year
FROM products
WHERE model_year = 2024
ORDER BY product_name ASC ;
