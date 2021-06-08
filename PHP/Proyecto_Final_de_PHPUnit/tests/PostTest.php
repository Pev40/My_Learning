<?php
use PHPUnit\Framework\TestCase;
use App\Author;
use App\Category;

use App\Post;
use App\Comment;

class PostTest extends TestCase
{

    public function test_add_comment_to_post()
    {
        $autor1= new Author("Piero");
        $categoria1 = new Category();
        $post = new Post("Bienvenidos","HELLO word",$autor1,$categoria1);
        $post2 = new Post('hola','hhhhhh',$autor1,$categoria1);
        $comentario = new Comment();
        $post->addComment($comentario);
        $this->assertEquals(1,$post->countComments());
       $this->assertInstanceOf(Comment::class,$post->getComent()[0]);

    }
}
