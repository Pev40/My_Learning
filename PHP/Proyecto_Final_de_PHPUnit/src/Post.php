<?php



namespace App;

class Post
{
    public $title;
    public $content = [];
    public $autor;
    public $category;
    public $comentarios = [];


    public function __construct($title,$content,Author $autor, Category $category)
    {
        $this->title = $title;
        $this->content []= $content;
        $this->autor = $autor;
        $this->category = $category;        
    }

    public function countComments()
    {
        return count($this->comentarios);
    }

    public function addComment(Comment $comentario)
    {
        array_unshift($this->comentarios, $comentario);
    }

    public function getComent()
    {
        return $this->comentarios;
    }
}
